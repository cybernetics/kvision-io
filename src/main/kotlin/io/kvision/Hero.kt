package io.kvision

import pl.treksoft.kvision.core.Container
import pl.treksoft.kvision.html.TAG
import pl.treksoft.kvision.html.div
import pl.treksoft.kvision.html.h1
import pl.treksoft.kvision.html.h2
import pl.treksoft.kvision.html.image
import pl.treksoft.kvision.html.link
import pl.treksoft.kvision.html.p
import pl.treksoft.kvision.html.section
import pl.treksoft.kvision.html.tag
import pl.treksoft.kvision.utils.perc

fun Container.hero() {
    section(className = "hero is-default is-bold") {
        navbar()
        navbar(false)
        div(className = "hero-body") {
            div(className = "container") {
                div(className = "has-text-centered") {
                    tag(TAG.FIGURE, className = "image is-96x96 is-inline-block") {
                        image(Hero.logo, Hero.logoAlt)
                    }
                    h1(Hero.title, className = "title is-1 is-bold is-spaced")
                    h2(markedInline(Hero.subtitle), rich = true, className = "subtitle is-5 is-muted")
                    p {
                        link(
                            Hero.buttonText,
                            Hero.buttonLink,
                            className = "button cta is-large rounded secondary-btn raised"
                        )
                    }
                }
                div(className = "columns") {
                    div(className = "column is-half") {
                        tag(TAG.CODE, Hero.reactiveHello, className = "code-blocks-selector") {
                            width = 100.perc
                            setAttribute("data-highlight-only", "nocursor")
                            setAttribute("theme", "darcula")
                            setAttribute("auto-indent", "true")
                            setAttribute("mode", "kotlin")
                            setAttribute("lines", "true")
                        }
                    }
                    div(className = "column is-half") {
                        tag(TAG.CODE, Hero.imperativeHello, className = "code-blocks-selector") {
                            width = 100.perc
                            setAttribute("data-highlight-only", "nocursor")
                            setAttribute("theme", "idea")
                            setAttribute("auto-indent", "true")
                            setAttribute("mode", "kotlin")
                            setAttribute("lines", "true")
                        }
                    }
                }
            }
        }
    }
}
