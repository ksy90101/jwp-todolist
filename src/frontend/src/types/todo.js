export class Todo {
    id;
    content;
    status;
    date;

    constructor({id, content, status, date}) {
        this.id = id;
        this.content = content;
        this.status = status;
        this.date = date;
    }

    isComplete() {
        return this.status === 'COMPLETE'
    }

    isActive() {
        return this.status === 'ACTIVE'
    }
}