class Trade (val ID: String, val Symbol: String, val quantity: Int, var _price: Double ){
//Write a Trade class. A Trade has an ID, a Symbol (such as "AAPL" or "IBM"), a quantity and a price, for example, it might be created as follows
  def price = _price // Getter
  def price_= (value: Double) = if (price >= 0) _price = value //Setter
  def value() = quantity * price
  override def toString() = s"ID: ${ID}, Symbol: ${Symbol}, Quantity: ${quantity}, Price: ${price}"

}
