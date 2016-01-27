class NewCounter{
	private int limit,count;
	private NewCounter next;

	NewCounter (int limit0, int count0, NewCounter next0) {
		this.limit = limit0;
		this.count = count0;
		this.next = next0;
	}
	
	void setter(int a,int b, NewCounter c){
		this.limit=a;
		this.count=b;
		this.next=c;
	}

	int getter(){
		return count;
	}

	void tick(){
		count++;
		if(count >= limit){
			count = 0;
			if(next != null){
				next.tick();
			}
		}
	}
	
}
