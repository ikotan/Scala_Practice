object CarExtends {
  def main(args: Array[String]) {
    val car = new Car("Bule")
    output(car)
    car.run
    
    val truck = new Truck("Siliver")
    output(truck)
    truck.run
  }

  private def output(car: Car): Unit = println("Color is " + car.color + ".")
}

class Car(val color: String) {
  def run = println("Start!!")
}

class Truck(color: String) extends Car(color) {
  override def run = println("Truck Start!!")
}

CarExtends.main(Array())
