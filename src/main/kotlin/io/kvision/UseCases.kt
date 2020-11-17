package io.kvision

import pl.treksoft.kvision.core.Container
import pl.treksoft.kvision.html.TAG
import pl.treksoft.kvision.html.div
import pl.treksoft.kvision.html.h2
import pl.treksoft.kvision.html.h3
import pl.treksoft.kvision.html.image
import pl.treksoft.kvision.html.link
import pl.treksoft.kvision.html.section
import pl.treksoft.kvision.html.tag

fun Container.useCases() {
    link("") {
        id = UseCases.id
    }
    section(className = "section is-medium section-secondary") {
        div(className = "container") {
            div(className = "title-wrapper has-text-centered") {
                h2(UseCases.title, className = "title is-2 light-text is-spaced")
                h3(UseCases.subtitle, className = "subtitle is-5 light-text")
            }
            div(className = "content-wrapper") {
                div(className = "columns is-vcentered") {
                    UseCases.useCases.forEach {
                        useCase(it)
                    }
                }
            }
        }
    }
}

fun Container.useCase(useCase: UseCase) {
    div(className = "column is-4 mt-30") {
        tag(TAG.FIGURE, className = "testimonial") {
            div(className = "box has-text-centered") {
                link("", useCase.url) {
                    setAttribute("target", "_blank")
                    tag(TAG.FIGURE, className = "image is-inline-block") {
                        image(useCase.image, "")
                        tag(TAG.FIGCAPTION, useCase.caption)
                    }
                }
            }
        }
    }
}
