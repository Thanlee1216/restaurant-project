package restaurantDB;

public class RestaurantInfo {
	
    private String placeName;		//���� �̸�
    private String categoryName;	//ī�װ� �̸�
    private String categoryDetail;	//ī�װ� ����
    private String phone;			//����ó
    private String addressName;		//���� �ּ�
    private String placeBest;		//��ǥ�޴�
    private String roadAddressName;	//���θ� �ּ�
    private String placeUrl;
    private String id;				//PK
    private String imageUrl;
    private String mood;
    
    public RestaurantInfo(String placeName, String categoryName, String categoryDetail, String phone, String addressName, String placeBest, String roadAddressName, 
    		String placeUrl, String id, String mood, String imageUrl) {
    	this.placeName=placeName;
    	this.categoryName=categoryName;
    	this.categoryDetail=categoryDetail;
    	this.phone=phone;
    	this.addressName=addressName;
    	this.placeBest=placeBest;
    	this.roadAddressName=roadAddressName;
    	this.placeUrl=placeUrl;
    	this.id=id;
    	this.mood=mood;
    	this.imageUrl=imageUrl;
	}
    
	public String getAddressName() {
		return addressName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getCategoryDetail() {
		return categoryDetail;
	}

	public String getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}

	public String getPlaceName() {
		return placeName;
	}

	public String getPlaceBest() {
		return placeBest;
	}

	public String getRoadAddressName() {
		return roadAddressName;
	}

	public String getPlaceUrl() {
		return placeUrl;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

	public String getMood() {
		return mood;
	}

	public void infoShortPrint() {
		System.out.println("| " + placeName + " |");
		System.out.println("| " + categoryName + " > " + categoryDetail + " |");
		System.out.println("| ��ǥ �޴� : " + placeBest + " |");
		System.out.println("-------------------------------------------------------");
		
	}
	
	public void infoFullPrint() {
		String printPlaceName=("| ���� �̸� : " + placeName);
		String printCategoryName=("| ī�װ� : " + categoryName + " > " + categoryDetail);
		String printRoadAddressName=("| �ּ� : " + roadAddressName);
		String printPlaceBest=("| ��ǥ �޴� : " + placeBest);
		String printPhone=("| ���� ����ó : " + phone);
		String printPlaceUrl=("| ��ũ : " + placeUrl);
	}
    
    


}
