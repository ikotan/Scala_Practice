// class Food
// abstract class Animal {
  // def eat(food: Food)
// }

// class Grass extends Food
// class Cow extends Animal {
  // override def eat(food: Grass) {}
// }

class Food
abstract class Animal {
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

class Grass extends Food
class Cow extends Animal {
  type SuitableFood = Grass
  override def eat(food: Grass) {}
}

class Fish extends Food
val bessy: Animal = new Cow
println( bessy )
bessy eat (new Fish)

class DogFood extends Food
class Dog extends Animal {
  type SuitableFood = DogFood
  override def eat(food: DogFood) {}
}


