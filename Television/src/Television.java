class Television {
// 텔레비전을 나타내는 클래스 
	// 상수들
	
	public static final int MINchannel = 1; // 가장 작은 채널의 번호
	public static final int MAXchannel = 99; // 가장 큰 채널의 번호
	
	public static final int MAXvolume = 12 ; // 가장 큰 볼륨의 크기 
	public static final int MINvolume = 0 ; // 가장 작은 볼륨의 크기
	
	// 객체 변수들
	
	String BrandName; // TV의 브랜드명
	boolean Powered = false; // TV가 켜져있는가 꺼져있는가? 켜지면 true
	int Channel = MINchannel; // 현재 TV채널의 번호
	int Volume = MINvolume; // TV의 볼륨 초기화 값
	
	// 기본 생성자 메소드
	public Television()
	{}
	
	// 접근자 메소드
	public int getChannel()
	{
		return Channel;
	}
	
	public String getBrandName()
	{
		return BrandName;
	}
	
	public int getVolume()
	{
		return Volume;
	}
	
	public boolean getPowered()
	{
		return Powered;
	}
	
	public String toString()
	{
		String realString = "";
		realString = realString + "브랜드명: " + getBrandName() +"\n";
		realString = realString + "전원: " + getPowered() + "\n";
		realString = realString + "채널 번호: " + getChannel() + "\n";
		realString = realString + "볼륨: " + getVolume() ;
		return realString;
	}
	
	// 변경자 메소드
	
	public void setPowered(boolean newPowered)
	{
		Powered = newPowered;
	}
	
	public void setChannel(int newChannel)
	{
		if(newChannel <MINchannel && newChannel >MAXchannel)
		{
			System.out.println("오류, 채널 번호는 유효한 범위 안에 있어야한다");
		}else if(this.getPowered() == true) {
			Channel = newChannel;
		}
	}
	
	public void setBrandName(String newBrandName)
	{
		BrandName = newBrandName;
	}
	
	public void setVolume(int newVolume)
	{
		Volume = newVolume;
	}
	
	public void incrementChannel()
	{
		if(Channel <MINchannel && Channel >MAXchannel)
		{
			System.out.println("오류, 채널 번호는 유효한 범위 안에 있어야한다");
		}else if (Channel == MAXchannel)
		{
			Channel=MINchannel;
		}else Channel = Channel +1;
		
	}
	
	public void decrementChannel()
	{
		if(Channel <MINchannel && Channel > MAXchannel)
		{
			System.out.println("오류, 채널 번호는 유효한 범위 안에 있어야한다");
		}else if (Channel == MINchannel)
		{
			Channel = MAXchannel;
		}else Channel = Channel-1;
	}
	
	public void incrementVolume()
	{
		if(Volume == MAXvolume)
		{
			Volume = MAXvolume;
		}else Volume = Volume +1;
	}
	
	public void decrementVolume()
	{
		if(Volume == MINvolume)
		{
			Volume = MINvolume;
		}else Volume = Volume -1;
	}
	
}