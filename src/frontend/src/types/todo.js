export class Todo {
    id;
    content;
    status;
    date;
    isEdit

    constructor({id, content, status, date}) {
        this.id = id;
        this.content = content;
        this.status = status;
        this.date = date;
        this.isEdit = false;
    }

    isComplete() {
        return this.status === 'COMPLETE'
    }

    isActive() {
        return this.status === 'ACTIVE'
    }
}