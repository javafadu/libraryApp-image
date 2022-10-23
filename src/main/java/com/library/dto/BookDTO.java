package com.library.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.library.domain.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {


    private Long id;
    private String name;
    private String isbn;

    private Integer pageCount;

    private Long bookAuthor;

    private Long bookPublisher;
    private Integer publishDate;

    private Long bookCategory;
    private String imageLink;

    private Boolean loanable = true;

    private String shelfCode;

    private Boolean active = true;

    private Boolean featured = false;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
            "MM/dd/yyyy HH:mm:ss", timezone = "Turkey")
    private LocalDateTime createDate;

    private Boolean builtIn = false;

    private List<Loan> loanedBooks = new ArrayList<>();




}
