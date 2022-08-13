package javaProgram;

public class JavaArrayObjects {

	public static void main(String[] args) {
		// array of objects ex.
		
		// 1st example of array of objects
		RagnarojJob[] job = new RagnarojJob[6];
		
		RagnarojJob jobChanger1 = new RagnarojJob("Swordman");
		RagnarojJob jobChanger2 = new RagnarojJob("Mage");
		RagnarojJob jobChanger3 = new RagnarojJob("Merchant");
		RagnarojJob jobChanger4 = new RagnarojJob("Acolyte");
		RagnarojJob jobChanger5 = new RagnarojJob("Thief");
		RagnarojJob jobChanger6 = new RagnarojJob("Archer");
		
		job[0] = jobChanger1;
		job[1] = jobChanger2;
		job[2] = jobChanger3;
		job[3] = jobChanger4;
		job[4] = jobChanger5;
		job[5] = jobChanger6;
		
		System.out.println("1st Job list:");
		System.out.println(job[0].job);
		System.out.println(job[1].job);
		System.out.println(job[2].job);
		System.out.println(job[3].job);
		System.out.println(job[4].job);
		System.out.println(job[5].job);
		System.out.println();
		
		// 2nd example of array of objects
		RagnarojJob job2ndChange1 = new RagnarojJob("Knight");
		RagnarojJob job2ndChange2 = new RagnarojJob("Wizard");
		RagnarojJob job2ndChange3 = new RagnarojJob("Blacksmith");
		RagnarojJob job2ndChange4 = new RagnarojJob("Priest");
		RagnarojJob job2ndChange5 = new RagnarojJob("Assasin");
		RagnarojJob job2ndChange6 = new RagnarojJob("Hunter");
		
		RagnarojJob[] job2 = {job2ndChange1,job2ndChange2,job2ndChange3,job2ndChange4,job2ndChange5,job2ndChange6};
		
		System.out.println("2nd Job list (2-1):");
		System.out.println(job2[0].job);
		System.out.println(job2[1].job);
		System.out.println(job2[2].job);
		System.out.println(job2[3].job);
		System.out.println(job2[4].job);
		System.out.println(job2[5].job);
		
		
	}

}
