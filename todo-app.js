let todos = []

const addTodo = task => {
    todos.push(task)
}

const viewTodos = () => {
    todos.forEach((todo, i) => {
        console.log(i + 1, todo)
    })
}

addTodo("Buy milk")
addTodo("Finish homework")
viewTodos()
