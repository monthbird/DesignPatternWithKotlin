import com.example.designpattern.abstractfactory.FactoryProducer

fun main(args: Array<String>) {
    val shape = FactoryProducer.getFactory("SHAPE")
    val circle = shape!!.getShape("CIRCLE");
    circle!!.draw();

    val color = FactoryProducer.getFactory("COLOR")
    val green = color!!.getColor("GREEN")
    green!!.fill();
}