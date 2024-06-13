/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClientesDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author henri
 */
public class ClientesDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClientesDTO> lista = new ArrayList<>();

    public void CadastrarCliente(ClientesDTO objCadClientes) throws ParseException {
        // Esta linha define a instrução SQL que será usada para inserir um novo registro na tabela de clientes.
        String sql = "insert into clientes(nome, datanascimento, cpf, n_telefone, rua, complemento, cep, numero) values (?,?,?,?,?,?,?,?)";

        //Esta linha cria uma nova conexão com o banco de dados
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadClientes.getNome());
            pstm.setString(2, objCadClientes.getDataNascimento());
            pstm.setString(3, objCadClientes.getCpf());
            pstm.setString(4, objCadClientes.getN_telefone());
            pstm.setString(5, objCadClientes.getRua());
            pstm.setString(6, objCadClientes.getComplemento());
            pstm.setString(7, objCadClientes.getCep());
            pstm.setString(8, objCadClientes.getNumero());

            pstm.execute();

            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadClientesDAO " + erro);
        }

    }

    public ArrayList<ClientesDTO> PesquisarCliente() {
        // Define a instrução SQL que será usada para buscar todos os registros da tabela de clientes,
        // formatando a data de nascimento.
        String sql = "SELECT id_cliente, nome, DATE_FORMAT(datanascimento, '%d/%m/%Y') AS datanascimento_formatada, cpf, n_telefone, rua, complemento, cep, numero FROM clientes";

        // Cria uma nova conexão com o banco de dados.
        conn = new ConexaoDAO().conectaDB();

        try {
            // Prepara a instrução SQL para execução.
            pstm = conn.prepareStatement(sql);

            // Executa a instrução SQL e armazena o resultado no objeto ResultSet chamado rs.
            rs = pstm.executeQuery();

            // Este bloco de código é executado para cada registro retornado pela instrução SQL.
            while (rs.next()) {
                ClientesDTO objCadClientes = new ClientesDTO();

                objCadClientes.setId_cliente(rs.getString("id_cliente"));
                objCadClientes.setNome(rs.getString("nome"));
                objCadClientes.setDataNascimento(rs.getString("datanascimento_formatada")); // Usando o alias formatado
                objCadClientes.setCpf(rs.getString("cpf"));
                objCadClientes.setN_telefone(rs.getString("n_telefone"));
                objCadClientes.setRua(rs.getString("rua"));
                objCadClientes.setComplemento(rs.getString("complemento"));
                objCadClientes.setCep(rs.getString("cep"));
                objCadClientes.setNumero(rs.getString("numero"));

                lista.add(objCadClientes);
            }
        } catch (SQLException erro) {
            // Exibe uma mensagem de erro caso ocorra um erro durante a execução do bloco try.
            JOptionPane.showMessageDialog(null, "PesquisarClienteDAO: " + erro);
        } 
        return lista;
    }

    public void AlterarCliente(ClientesDTO objCadClientes) {
        String sql = "update clientes set nome = ?, datanascimento = ?, cpf = ?, n_telefone = ?, rua = ?, complemento = ?, cep = ?, numero = ? where id_cliente = ?";

        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadClientes.getNome());

            // Converte a data de nascimento de String para java.sql.Date
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Ajuste o formato da data conforme necessário
            java.util.Date parsed = format.parse(objCadClientes.getDataNascimento());
            java.sql.Date dataNascimentoSql = new java.sql.Date(parsed.getTime());

            pstm.setDate(2, dataNascimentoSql); // Usa setDate em vez de setString
            pstm.setString(3, objCadClientes.getCpf());
            pstm.setString(4, objCadClientes.getN_telefone());
            pstm.setString(5, objCadClientes.getRua());
            pstm.setString(6, objCadClientes.getComplemento());
            pstm.setString(7, objCadClientes.getCep());
            pstm.setString(8, objCadClientes.getNumero());
            pstm.setString(9, objCadClientes.getId_cliente());

            //Esta linha executa a instrução SQL para inserir o novo registro no banco de dados
            pstm.execute();

            /*Esta linha fecha o objeto PreparedStatement. É uma boa prática fechar objetos PreparedStatement quando você 
        terminar de usá-los para liberar recursos do banco de dados*/
            pstm.close();

        } catch (SQLException | ParseException erro) {
            JOptionPane.showMessageDialog(null, "AlterarClientesDAO " + erro);
        }

    }

    public void ExcluirCliente(ClientesDTO objCadClientes) {
        String sql = "delete from clientes where id_cliente = ?";

        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objCadClientes.getId_cliente());

            //Esta linha executa a instrução SQL para inserir o novo registro no banco de dados
            pstm.execute();

            /*Esta linha fecha o objeto PreparedStatement. É uma boa prática fechar objetos PreparedStatement quando você 
            terminar de usá-los para liberar recursos do banco de dados*/
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ExcluirClientesDAO " + erro);
        }

    }

}
