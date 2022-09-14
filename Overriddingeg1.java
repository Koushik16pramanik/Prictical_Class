package Activity;

 class Exam{
		int marks () {
		return 0;
			}}
		class computer extends Exam{
			int marks() {
				return 70;
				
			}}
		class mathematics extends Exam{
			int marks() {
				return 80;
			}}
		class sciences extends Exam{
			int marks() {
				return 90;
			}}
		class english extends Exam{
			int marks(){
			return 50;
		}}
		 class Overriddingeg1 {
		public static void main(String args[]) {
			computer c=new computer();
			mathematics m=new mathematics();
			sciences s=new sciences();
			english e=new english();
			System.out.println("computer marks is: "+c.marks());
			
			s.marks();
			e.marks();
			}}