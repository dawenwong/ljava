/* 

	break - continue -goto
 
*/


class break_continue_goto{
	public static void main(String[] args){
		loop1:for(int i = 1;i <= 4;i++){ //loop1是个自定义的标识
			
			for(int j = 1;j <= 10;j++){
				
				if(j%4==0){
					//break;  //直接跳出该层循环
					//continue; //跳过4继续执行
					//break loop1; //直接跳出 loop1标识的地方
					continue loop1;
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}