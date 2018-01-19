package Arrays;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] check={'s','a','a','b','b','c','a'};
		removeDups(check);
		removeDuplictes(check);
	}
	
	// Remove duplicates existing in char array adjacent to each other
	static void removeDups(char[] str){
		if(str==null)
			return;
		if(str.length<2)
			return;
		int tail=1;
		
		for (int i = 1; i < str.length; ++i) {
			int j;
			for(j=0;j<tail;++j){
				if(str[i]==str[j])
					break;
			}
			if(j==tail){
				str[tail]=str[i];
				++tail;
			}		
		}
		str[tail]=0;
		System.out.println(str);
	}
	
	// remove duplicates with additional memory of constant size
	static void removeDuplictes(char[] str){
		if(str==null)
			return;
		if(str.length<2)
			return;
		
		boolean[] match=new boolean[256];
		for (int i = 0; i < match.length; i++) {
			match[i]=false;
		}	
		match[str[0]]=true;
		int tail=1;
		
		for(int i=1;i<str.length;++i){
			if(!match[str[i]]){
				 str[tail]=str[i];
				 ++tail;
				 match[str[i]]=true;
			}		
		}
		str[tail]=0;
		System.out.print(str);
	}
}
