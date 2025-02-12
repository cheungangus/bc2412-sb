package com.bootcampdemo.demo_sb_customer.codewave;

public class BusinessException extends RuntimeException {
        private String code;
        
    public static BusinessException of (SysCode syscode){
        return new BusinessException(syscode);
    }
    
        private BusinessException(SysCode syscode){
            super(syscode.getMessage());
            this.code = syscode.getCode();
        }
        public String getCode(){
            return this.code;
        }
}
