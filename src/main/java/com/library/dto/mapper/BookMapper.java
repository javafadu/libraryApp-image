package com.library.dto.mapper;


import com.library.domain.Book;
import com.library.dto.BookDTO;
import com.library.dto.response.BookRegisterResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookRegisterResponse BookToBookRegisterResponse(Book book);

    Book BookDTOToBook(BookDTO bookDTO);




}
