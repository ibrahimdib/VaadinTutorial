
import {PolymerElement,html} from '@polymer/polymer/polymer-element.js';


class EventHandler extends PolymerElement {
    static get template() {
        return html`<button on-click="handleClick">Click me</button>`;
    }
    static get is() { return 'event-handler' }
}


customElements.define(EventHandler.is, EventHandler);