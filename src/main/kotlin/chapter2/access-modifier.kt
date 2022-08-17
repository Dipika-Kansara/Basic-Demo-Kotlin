package chapter2

fun main() {
    // access Modifier

    //1. private
  //  If you mark a declaration as PRIVATE, it will only be visible inside the file that contains the declaration.
    ///2. public
    //3. protected
    //The protected modifier is not available for top-level declarations.
    //4 : internal
    //If you mark it as Internal, it will be visible everywhere in the same module.

    // no access modifier means it will be automatically public

    var myAnimal = Animal("Tiger")


}
// private access modifier is for access particular defination
//private means no one can access that member except other members of classs
private class Animal(val name : String)  {

}




