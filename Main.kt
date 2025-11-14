fun main() {
    // 1. Create a list of integers (1 to 25 for demonstration)
    val numbers = (1..25).toList()
    println("Initial List: $numbers\n")

    // --- 1. Filter: Find Even Numbers ---
    val evens = numbers.filter { it % 2 == 0 }

    println("--- Evens (filtered from initial list) ---")
    println(evens)
    println()

    // --- 2. Map: Calculate Squares of Even Numbers ---
    // We continue working with the 'evens' list
    val squaresOfEvens = evens.map { it * it }

    println("--- Squares (mapped from evens list) ---")
    println(squaresOfEvens)
    println()

    // --- 3. Reduce/Fold: Calculate Sum of Squares ---
    // We use 'fold' which is often safer than 'reduce' as it takes an initial value (0L in this case)
    // Using Long to prevent potential overflow for larger sums
    val sumOfSquares = squaresOfEvens.fold(0L) { acc, n -> acc + n }

    println("--- Sum (reduced from squares list) ---")
    println("Sum: $sumOfSquares")
}
