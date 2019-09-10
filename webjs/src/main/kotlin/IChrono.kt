interface IChrono{
  interface IPresenter{
    fun start()
    fun stop()
    fun resume()
  }
  interface IView{
    fun render()
    fun update(value:Long)
  }
}
