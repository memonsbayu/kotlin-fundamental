fun main() {
    val user = setUser("Bayu", "play with friends", 16)
    print(user)
}
fun setUser(name: String, hobby: String, age: Int) =
        "My name is $name, I like $hobby and,  I'm $age years old"