package test1;

import java.math.BigDecimal;

public class Caculatorbean {
	
	
	private String firstNum="0";
	private char operator='+';
	private String secondNum="0";
	private String result;

	
	public String getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(String firstNum) {
		this.firstNum = firstNum;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public String getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(String secondNum) {
		this.secondNum = secondNum;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	
	public void caculator(){
		BigDecimal first=new BigDecimal(this.firstNum);
		BigDecimal second=new BigDecimal(this.secondNum);
		
		
		switch(this.operator){
		case '+':{
			this.result=first.add(second).toString();
		break;	
		}
		case '-':{
			this.result=first.subtract(second).toString();
			
			break;	
			}
		case '*':{
			this.result=first.multiply(second).toString();
			break;	
			}
		case '/':{
			
			if(second.doubleValue()==0){
				throw new RuntimeException("被除数不能为0！");
				
			}
			this.result=first.divide(second,2,BigDecimal.ROUND_HALF_UP).toString();
			
			break;	
			}
		default:
			throw new RuntimeException("运算符只能是+-*/");
			
		}
	}
}
