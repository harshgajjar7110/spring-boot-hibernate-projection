# spring-boot-hibernate-projection

Spring Data query methods usually return one or multiple instances of the aggregate root managed by the repository. However, it might sometimes be desirable to create projections based on certain attributes of those types. Spring Data allows modeling dedicated return types, to more selectively retrieve partial views of the managed aggregates.

* Interface-based Projections
* Closed Projections
* Dynamic Projections
