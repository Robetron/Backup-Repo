fun main(args: Array<String>){
	println(ruleGen("Hello"))
	
	
}

fun ruleGen(key: String):String{
	n: Int = 0
	ipstring: String = ""
	val keyBytes: ByteArray = key.toByteArray()
	
	for(byte in keyBytes){
		println(byte)
		ipstring += ("00000000"+Int.toBinaryString(as[i])).substring(Int.toBinaryString(as[i]).length())
	}
	
	return ipstring
}


// public class RuleGenerator {
//     public static void main(String[] args) {
//         byte[] as = k.getBytes();
// //O(128) = O(16n)       
//         for(int i = 0; i<k.length(); i++) //takes in one character at a time and converts it into 8 bit binary  
//             ipstring+=("00000000"+Integer.toBinaryString(as[i])).substring(Integer.toBinaryString(as[i]).length());
//         int[][] Rule = new int[(ipstring.length()/64)+1][16]; //rule matrix initilised to height        
// //O(32) = O(4n)
//         for(int i=0,c=0,r=0;i<ipstring.length(); i+=4) {
//             if(c==16){r++;c=0;}       //converting 8 bit binary  to 4 bit decimal
//             int x=0;
//             if(ipstring.charAt(i)=='1')x+=8;
//             if(ipstring.charAt(i+1)=='1')x+=4;
//             if(ipstring.charAt(i+2)=='1')x+=2;
//             if(ipstring.charAt(i+3)=='1')x+=1;
//             Rule[r][c++]=x;
//             n=r+1;
//         }
//         int[][] rule = new int[n][16];
// //O(n*16) = O(16n)
//         for(int l=0; l<n; l++)
//             for(int p=0; p<16; p++)
//                 rule[l][p]=-1;
//         //O(n*(8+16)) = O(24n)
//         for(int l=0; l<n; l++) { //loop to form rules in rulgen
//             int i=0,j=15;
//             if(Rule[l][i]==Rule[l][j])rule[l][Rule[l][i]]=Rule[l][i]; //first pair is formed 
//             else{
//                 rule[l][Rule[l][j]]=Rule[l][i];
//                 rule[l][Rule[l][i]]=Rule[l][j];
//             }
//             while(i<=j){ //till right pointer crosses left pointer
//                 while(i<15 && rule[l][Rule[l][i]]!=-1)i++;//increment left pointer
//                 while(j>0 && rule[l][Rule[l][j]]!=-1)j--;//increment right pointer
                
//                 if(Rule[l][i]==Rule[l][j])rule[l][Rule[l][i]]=Rule[l][i];
//                 else{
//                     rule[l][Rule[l][j]]=Rule[l][i]; //for pairs other then first pair
//                     rule[l][Rule[l][i]]=Rule[l][j]; 
//                 }
//             }
//             for(int p=0; p<16; p++)
//                 if(rule[l][p]==-1)rule[l][p]=p; //map the unmapped rule elements to themselves
//         }
//         for(int i=0;i<n;i++){
//             for (int j = 0; j < 16; j++) 
//                 System.out.print(Rule[i][j]+" ");
//             System.out.print("\t");
//             for (int j = 0; j < 16; j++) 
//                 System.out.print(rule[i][j]+" ");
//             System.out.println("");
//         }  
//     }
// }