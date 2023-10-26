package com.ssafy.test;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

public class Test {
    public static void main(String[] args) {
        BoardDao dao = BoardDaoImpl.getInstance();

        for (int i = 0; i < 10; i++) {
            Board board = new Board("제목" + i, "작성자" + i, "내용" + i);
            dao.insertBoard(board);
        }

//		dao.insertBoard(board);
//		

//		dao.deleteBoard(2);

        // 서7 김태운
//		try {
//			dao.updateViewCnt(7);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

//		System.out.println(dao.selectOne(10));

        for (Board b : dao.selectAll()) {
            System.out.println(b);
        }
    }
}
