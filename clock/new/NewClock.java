class NewClock{
	NewCounter h, m, s;

	public static void main(String[] args){
		NewClock clock = new NewClock();

		int[] time = clock.getTime(args);
		clock.setTime(time);
		clock.run();
	}
	
	int[] getTime(String[] args){
		int[] time = {0,0,0};
		time[0] = Integer.parseInt(args[0]);
		time[1] = Integer.parseInt(args[1]);
		time[2] = Integer.parseInt(args[2]);
		return time;
	}
	
	void setTime(int[] time){
		h = new NewCounter(24, time[0], null);
		m = new NewCounter(60, time[1], h);
		s = new NewCounter(60, time[2], m);
	}

	void run(){
		while(true){
			System.out.printf("%02d:%02d:%02d\n",h.getter(),m.getter(),s.getter());
			s.tick();
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				throw new Error(e);
			}
		}
	}
}
