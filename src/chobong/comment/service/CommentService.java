package chobong.comment.service;

import java.sql.SQLException;
import java.util.List;

import chobong.movie.dao.CommentDAO;
import chobong.movie.dao.CommentDAOImpl;
import chobong.movie.dto.CommentDTO;

public class CommentService {
	public static CommentDAO commentDAO = new CommentDAOImpl();
	
	public static List<CommentDTO> selectComment(String commentBoard) throws SQLException{
		List<CommentDTO> list = commentDAO.selectComment(commentBoard);
		return list;		
	}
	public static int insertComment(CommentDTO dto) throws SQLException {
		System.out.println("insertService");
		int result = commentDAO.insertComment(dto);
		return result;
	}
	
	
}
