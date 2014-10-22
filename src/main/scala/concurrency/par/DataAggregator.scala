package concurrency.par

trait DataAggregator {
  this: CustomerRepository with OrderRepository =>

  def aggregate(f: OrderAmount => Boolean): Set[(Name, OrderAmount)] = ???
}

object DataAggregator extends CustomerRepository with OrderRepository

