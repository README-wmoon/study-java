package hashMapTest;

public class Product_pf {
//	상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
//	1. 상품 1개를 제작하여 JSON형식으로 변경
//	2. JSON 형식의 상품 정보 중 상품 재고 출력
//	3. 할인 중인 상품 정보 제작
//	4. 할인 중인 상품의 KEY값은 discount로 설정
//	5. JSON 형식으로 변경
//	6. JSON 할인을 필드 추가
//	7. JSON 형식의 상품 정보 중 할인율 출력
//  상품 번호, 상품 이름, 상품 가격, 상품 재고
//  상품 번호, 상품 이름, 상품 가격, 상품 재고
  private static Long sequence;
  private Long productId;
  private String productName;
  private int productPrice;
  private int productStock;

//  static 블록 : 단 한 번만 실행
  static {
     sequence = 0L;
  }
  
//  초기화 블록: 생성자를 호출할 때 마다 실행
  {
     sequence++;
  }
  
  public Product_pf() {;}
  
  public Product_pf(String productName, int productPrice, int productStock) {
     this.productId = sequence;
     this.productName = productName;
     this.productPrice = productPrice;
     this.productStock = productStock;
  }

  public Long getProductId() {
     return productId;
  }

  public void setProductId(Long productId) {
     this.productId = productId;
  }

  public String getProductName() {
     return productName;
  }

  public void setProductName(String productName) {
     this.productName = productName;
  }

  public int getProductPrice() {
     return productPrice;
  }

  public void setProductPrice(int productPrice) {
     this.productPrice = productPrice;
  }

  public int getProductStock() {
     return productStock;
  }

  public void setProductStock(int productStock) {
     this.productStock = productStock;
  }

  @Override
  public String toString() {
     return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
           + ", productStock=" + productStock + "]";
  }

	
}
