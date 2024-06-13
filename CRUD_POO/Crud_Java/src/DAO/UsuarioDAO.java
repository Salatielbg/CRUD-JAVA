/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.ConexaoDAO;
import DTO.UsuarioDTO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author henri
 */
public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into usuario (nome_usuario, senha_usuario) value (?, ?)";

        conn = (Connection) new ConexaoDAO().conectaDB();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());

            pstm.execute();

            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);

        }

    }

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {

        conn = (Connection) new ConexaoDAO().conectaDB();
        try {
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException ERRO) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO " + ERRO);

        }
        return null;

    }

}
