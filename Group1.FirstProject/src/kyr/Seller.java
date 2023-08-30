package kyr;

import java.sql.Date;

public class Seller {
	private String sellerId;
	private String seller; // 판매처명
	private String sellerAddr; // 도로명주소
	private String zipCode; // 우편번호
	private String isTrashBag; // 종량제봉투취급여부
	private String isGarBag; // 음식물납부필증(가정용)취급여부
	private String isGarbageLarge; // 임식물납부필증(120L)취급여부
	private String isWasteSticker; // 대형폐기스티커취급여부
	private String isSpecialEnvelope; // 특수규격봉투취급여부
	private Date baseDate; // 데이터 기준 일자
	
	void setSeller(
			String sellerId,
			String seller,
			String sellerAddr,
			String zipCode,
			String isTrashBag,
			String isGarBag,
			String isGarbageLarge,
			String isWasteSticker,
			String isSpecialEnvelope,
			Date baseDate
	) {
		setSellerId(sellerId);
		setSeller(seller);
		setSellerAddr(sellerAddr);
		setZipCode(zipCode);
		setIsTrashBag(isTrashBag);
		setIsGarBag(isGarBag);
		setIsGarbageLarge(isGarbageLarge);
		setIsWasteSticker(isWasteSticker);
		setIsSpecialEnvelope(isSpecialEnvelope);
		setBaseDate(baseDate);
	}
	
	void setSellerId(String sellerId) { this.sellerId = sellerId; }
	void setSeller(String seller) { this.seller = seller; }
	void setSellerAddr(String sellerAddr) { this.sellerAddr = sellerAddr; }
	void setZipCode(String zipCode) { this.zipCode = zipCode; }
	void setIsTrashBag(String isTrashBag) { this.isTrashBag = isTrashBag; }
	void setIsGarBag(String isGarBag) { this.isGarBag = isGarBag; }
	void setIsGarbageLarge(String isGarbageLarge) { this.isGarbageLarge = isGarbageLarge; }
	void setIsWasteSticker(String isWasteSticker) { this.isWasteSticker = isWasteSticker; }
	void setIsSpecialEnvelope(String isSpecialEnvelope) { this.isSpecialEnvelope = isSpecialEnvelope; }
	void setBaseDate(Object object) { 
//		System.out.println(Date.valueOf(object.toString()));
		this.baseDate = Date.valueOf(object.toString());
	}
	
	public String getSellerId() { return this.sellerId; }
	public String getSeller() { return this.seller; }
	public String getSellerAddr() { return this.sellerAddr; }
	public String getZipCode() { return this.zipCode; }
	public String getIsTrashBag() { return this.isTrashBag; }
	public String getIsGarBag() { return this.isGarBag; }
	public String getIsGarbageLarge() { return this.isGarbageLarge; }
	public String getIsWasteSticker() { return this.isWasteSticker; }
	public String getIsSpecialEnvelope() { return this.isSpecialEnvelope; }
	public Date getBaseDate() { return this.baseDate; }
}
