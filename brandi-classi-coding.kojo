clear()
drawStage(ColorMaker.pink)

class BouncingRect(x: Int, y: Int) {
val pic = Picture.rectangle(30, 70)
pic.setFillColor(red)
pic.setPosition(x+3, y+2)
var vel = Vector2D(7, 15)
val gravity = Vector2D(0, -0.2)

def draw() {
pic.draw()
}

def step() {
vel = vel + gravity
pic.translate(vel)
if (pic.collidesWith(stageBorder)) {
vel = bouncePicVectorOffStage(pic, vel)
}
}
}

val br = new BouncingRect(-100, -100)
br.draw()

animate {
br.step()
}