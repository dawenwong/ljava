/* 

	break - continue -goto
 
*/


class break_continue_goto{
	public static void main(String[] args){
		loop1:for(int i = 1;i <= 4;i++){ //loop1�Ǹ��Զ���ı�ʶ
			
			for(int j = 1;j <= 10;j++){
				
				if(j%4==0){
					//break;  //ֱ�������ò�ѭ��
					//continue; //����4����ִ��
					//break loop1; //ֱ������ loop1��ʶ�ĵط�
					continue loop1;
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}