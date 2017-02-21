package numbertowords;

public class NumberToWords {

	public static void main(String[] args) {
		
		String units[]={"","one","two","three","four","five","six","seven","eight","nine"};
		String teens[]={"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String tens[]={"","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		String max[]={"hundred","thousand","lakh","crore"};
		String str="";
		String number="221568924";
		String sample="22--15--68--924";
		int pos=1;
		int len=number.length();
		String newnum=null;
		int sampleNum=0;
		if(len>3){
			
			newnum=number.substring(0, len-2);
			if(newnum.length()%2!=0){
				
				newnum=0+newnum;
			}
		}
		if(newnum.length()>=5){
			
			sampleNum=Integer.parseInt(newnum.substring(0,2));
			if(sampleNum>1 && sampleNum<10){
				str=units[sampleNum]+max[3];
			}
			if(sampleNum>=10 && sampleNum<=19){
				str=teens[sampleNum]+max[3];
				
			}
			if(sampleNum%10==0){
				str=tens[sampleNum%10]+max[3];
			}
			else{
				str=tens[sampleNum/10]+" " +units[sampleNum%10]+" "+max[3];
			}
			sampleNum=Integer.parseInt(newnum.substring(2,4));
			
			if(sampleNum>1 && sampleNum<10){
				str=units[sampleNum]+max[2];
			}
			if(sampleNum>=10 && sampleNum<=19){
				str=teens[sampleNum]+max[2];
				
			}
			if(sampleNum%10==0){
				str=tens[sampleNum%10]+max[2];
			}
			else{
				str=tens[sampleNum/10]+" " +units[sampleNum%10]+" "+max[2];
			}
			
			sampleNum=Integer.parseInt(newnum.substring(4,6));
			if(sampleNum>1 && sampleNum<10){
				str=units[sampleNum]+max[1];
			}
			if(sampleNum>=10 && sampleNum<=19){
				str=teens[sampleNum]+max[1];
				
			}
			if(sampleNum%10==0){
				str=tens[sampleNum%10]+max[1];
			}
			else{
				str=tens[sampleNum/10]+" " +units[sampleNum%10]+" "+max[1];
			}
			
			String substr=number.substring((number.length()-3),number.length());
			
			
			
		}
		else if(newnum.length()>=3){
			
			
			
		}
		else if(newnum.length()>=1){
			
			
			
		}
	}

}
