package com.wm.contact.board.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wm.contact.board.board.model.Board;;

@Mapper
public interface BoardMapper {
	Board selectBoardById(int id);
	List<Board> selectAllboard();
	void insertBoard(Board board_In);
	void deleteBoardById(int id);
	void getBoardCountById(int id);
	void modifyBoard(int id,Board boardIn);
	
}
