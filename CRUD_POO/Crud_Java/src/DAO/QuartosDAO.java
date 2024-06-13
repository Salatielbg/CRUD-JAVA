/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.QuartoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Salatiel
 */
public class QuartosDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<QuartoDTO> lista = new ArrayList<>();

    public ArrayList<QuartoDTO> PesquisarQuarto() {
        //Esta linha define a instrução SQL que será usada para buscar todos os registros da tabela de clientes.
        String sql = "select * from quartos";

        //Esta linha cria uma nova conexão com o banco de dados.
        conn = new ConexaoDAO().conectaDB();

        try {
            // Esta linha prepara a instrução SQL para execução
            pstm = conn.prepareStatement(sql);

            //Esta linha executa a instrução SQL e armazena o resultado no objeto ResultSet chamado rs
            rs = pstm.executeQuery();//Esta linha executa a instrução SQL e armazena o resultado no objeto ResultSet chamado rs

            /*Este bloco de código é executado para cada registro retornado pela instrução SQL. Para cada registro, ele cria um novo 
            objeto CadClientesDTO, preenche os detalhes do cliente no objeto e adiciona o objeto à lista*/
            while (rs.next()) {
                QuartoDTO objCadQuarto = new QuartoDTO();

                objCadQuarto.setId_quarto(rs.getString("id"));
                objCadQuarto.setNumero(rs.getString("numero"));
                objCadQuarto.setTipo(rs.getString("tipo"));
                objCadQuarto.setPreco_diaria(rs.getDouble("preco_diaria"));
                objCadQuarto.setStatus(rs.getString("status"));

                lista.add(objCadQuarto);

            }
            /*Este bloco de código é executado se ocorrer um erro durante a execução do 
         bloco de código try. Ele exibe uma mensagem de erro.   */
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PesquisarQuartoDAO" + erro);
        }
        return lista;
    }

}
