package demo.other

opaque type Meep = Long

object Meep:
  def apply(m: Long): Meep = m

  extension (m: Meep) def value: Long = m

final case class Moop(value: Long)
