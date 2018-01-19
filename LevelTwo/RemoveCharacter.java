package logic;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeCharacterInString("My nameE is Raeshmietha Maery Alleam",'e'));
	}
	private static String removeCharacterInString(String string, char c) {
		// TODO Auto-generated method stub
		if(string.length()==0)
			return "";
		StringBuilder res=new StringBuilder();
		for(int i=0;i<string.length();i++) {
			char tmp=string.charAt(i);
			if(tmp==c)
				continue;
			res.append(tmp);
		}
		return res.toString();
	}

}
