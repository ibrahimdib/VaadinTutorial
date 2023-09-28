
import {PolymerElement,html} from '@polymer/polymer/polymer-element.js';
class ContactHandler extends PolymerElement {

    static get template() {
        return html`
            <input id="name" type="text">
            <button on-click="onClick">Send the contact</button>`;
    }

    static get is() { return 'contact-handler' }

    onClick(event) {
      alert(event.alert)
    }
}
customElements.define(ContactHandler.is, ContactHandler);

