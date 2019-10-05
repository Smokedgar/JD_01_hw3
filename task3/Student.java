package by.htp.nw3.task3;

public class Student {
	private String name;
	private int group;
	private int[] prgs = new int[5];

	public Student(String name, int group, int[] prgs) {
		this.name = name;
		this.group = group;
		for (int i = 0; i < this.prgs.length; i++) {
			if (i < prgs.length) {
				this.prgs[i] = prgs[i];
			} else {
					this.prgs[i] = 0;
			}
		}
	}

	public String getName() {
			return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public int getGroup() {
			return group;
	}

	public void setGroup(int group) {
			this.group = group;
	}
		
	public int[] getprgs() {
			return prgs;
	}

	public void setprgs(int[] prgs) {
		this.prgs = prgs;
	}
		
		
}