object Main extends App {
@main
  def main()={
  println("Hello")
  val trade = new Trade("344","IBM",98,45.98)
  trade.price = -12.98
  print(trade)
}
}
