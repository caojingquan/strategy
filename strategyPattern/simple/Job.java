package strategyPattern.simple;

public class Job {

	public static void work(Person p){
		p.excute();
	}
	
	public static void main(String[] args) {
		Job.work(new student());
	}
}
