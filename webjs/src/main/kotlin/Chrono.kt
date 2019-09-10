import kotlinx.html.button
import kotlinx.html.dom.create
import kotlinx.html.h1
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.span
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document
import kotlin.browser.window

class ChronoPresenter(private val view: IChrono.IView) : IChrono.IPresenter {
  private var currentChrono = 0L
  private var interval: Int = 0

  override fun resume() {
    interval = window.setInterval({
      currentChrono++
      view.update(currentChrono)
    }, 1)
  }

  override fun start() {
    currentChrono = 0L
    resume()
  }

  override fun stop() {
    if (interval != 0) {
      window.clearInterval(interval)
    }
  }
}

class ChronoView : IChrono.IView {

  private val chronoSpan: HTMLSpanElement = document.create.span { }
  var presenter: IChrono.IPresenter = ChronoPresenter(this)

  override fun render() {
    val root = requireNotNull(document.getElementById("root"))
    root.appendChild(document.create.div {
      h1 { +"Chrono" }
      button {
        +"Start"
        onClickFunction = { presenter.start() }
      }
      button {
        +"Stop"
        onClickFunction = { presenter.stop() }
      }
      button {
        +"Resume"
        onClickFunction = { presenter.resume() }
      }
    })
    root.appendChild(chronoSpan)
  }

  override fun update(value: Long) {
    chronoSpan.innerText = value.toString()
  }

}
