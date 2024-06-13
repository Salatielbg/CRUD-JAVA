/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ReservaDTO;
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
public class ReservaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ReservaDTO> lista = new ArrayList<>();

    public void CadastrarReserva(ReservaDTO objCadReserva) {

        String sql = "INSERT INTO reservas (id_cliente, nome, id_quarto, data_checkin, data_checkout, status) VALUES (?, ?, ?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadReserva.getId_cliente());
            pstm.setString(2, objCadReserva.getNome());
            pstm.setString(3, objCadReserva.getIdQuarto());
            pstm.setString(4, objCadReserva.getDataCheckin());
            pstm.setString(5, objCadReserva.getDataCheckout());
            pstm.setString(6, objCadReserva.getStatus());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadReservasDAO " + erro);
        }

    }

    public ArrayList<ReservaDTO> PesquisarReserva(String whereClause, String[] whereArgs) {
        ArrayList<ReservaDTO> lista = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT id, id_cliente, id_quarto, nome, ");
        sql.append("DATE_FORMAT(data_checkin, '%d/%m/%Y') AS data_checkin_formatada, ");
        sql.append("DATE_FORMAT(data_checkout, '%d/%m/%Y') AS data_checkout_formatada, status ");
        sql.append("FROM reservas");

        if (whereClause != null && !whereClause.isEmpty()) {
            sql.append(" WHERE ").append(whereClause);
        }

        Connection conn = new ConexaoDAO().conectaDB();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement(sql.toString());

            if (whereArgs != null) {
                for (int i = 0; i < whereArgs.length; i++) {
                    pstm.setString(i + 1, whereArgs[i]);
                }
            }

            rs = pstm.executeQuery();

            while (rs.next()) {
                ReservaDTO objCadReserva = new ReservaDTO();

                objCadReserva.setId(rs.getString("id"));
                objCadReserva.setId_cliente(rs.getString("id_cliente"));
                objCadReserva.setIdQuarto(rs.getString("id_quarto"));
                objCadReserva.setNome(rs.getString("nome"));
                objCadReserva.setDataCheckin(rs.getString("data_checkin_formatada"));
                objCadReserva.setDataCheckout(rs.getString("data_checkout_formatada"));
                objCadReserva.setStatus(rs.getString("status"));

                lista.add(objCadReserva);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PesquisarReservaDAO" + erro);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    public void AlterarReserva(ReservaDTO objCadReserva) {
        String sql = "update reservas set id_cliente = ?, nome =?, id_quarto = ?, data_checkin = ?, data_checkout = ? where id = ?";

        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadReserva.getId_cliente());
            pstm.setString(2, objCadReserva.getNome());
            pstm.setString(3, objCadReserva.getIdQuarto());
            pstm.setString(4, objCadReserva.getDataCheckin());
            pstm.setString(5, objCadReserva.getDataCheckout());
            pstm.setString(6, objCadReserva.getId());
            //Esta linha executa a instrução SQL para inserir o novo registro no banco de dados
            pstm.execute();

            /*Esta linha fecha o objeto PreparedStatement. É uma boa prática fechar objetos PreparedStatement quando você 
            terminar de usá-los para liberar recursos do banco de dados*/
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlterarReservaDAO " + erro);
        }

    }

    public void AlterarDataCheckin(ReservaDTO objCadReserva) {
        String sql = "update reservas set data_checkin = ?, status = ? where id = ?";

        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadReserva.getDataCheckin());
            pstm.setString(2, objCadReserva.getStatus());
            pstm.setString(3, objCadReserva.getId());

            //Esta linha executa a instrução SQL para inserir o novo registro no banco de dados
            pstm.execute();

            /*Esta linha fecha o objeto PreparedStatement. É uma boa prática fechar objetos PreparedStatement quando você 
            terminar de usá-los para liberar recursos do banco de dados*/
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlterarDataCheckinDAO " + erro);
        }

    }

    public void AlterarDataCheckout(ReservaDTO objCadReserva) {
        String sql = "update reservas set data_checkout = ?, status = ? where id = ?";

        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadReserva.getDataCheckout());
            pstm.setString(2, objCadReserva.getStatus());
            pstm.setString(3, objCadReserva.getId());

            //Esta linha executa a instrução SQL para inserir o novo registro no banco de dados
            pstm.execute();

            /*Esta linha fecha o objeto PreparedStatement. É uma boa prática fechar objetos PreparedStatement quando você 
            terminar de usá-los para liberar recursos do banco de dados*/
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlterarDataCheckinDAO " + erro);
        }

    }

    public void ExcluirReserva(ReservaDTO objCadReservaDTO) {
        String sql = "delete from reservas where id = ?";

        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objCadReservaDTO.getId());

            //Esta linha executa a instrução SQL para inserir o novo registro no banco de dados
            pstm.execute();

            /*Esta linha fecha o objeto PreparedStatement. É uma boa prática fechar objetos PreparedStatement quando você 
            terminar de usá-los para liberar recursos do banco de dados*/
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ExcluirReservaDAO " + erro);
        }

    }

}
