package com.tech.multipledatasources.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errStatusCode;
    private String errMsg;
    private Date errDate;
    private String reqDesc; 
}
