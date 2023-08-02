package com.example.demo.exception_handling;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ResourceNotFoundException extends RuntimeException{
   String ResourceName;
   String FieldName;
   int FieldValue;
   public ResourceNotFoundException(String ResouceName,String FieldName,int FieldValue) {
	   super(String.format("%s Not found with %s :%s",ResouceName,FieldName,FieldValue));
   }

}
