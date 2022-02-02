function getAdmin (map) {
    let admins = [];
    for ([key, value] of map) {
        if (value === 'Admin') {
            admins.push(key);
        }
    }
    return admins;
}

const users = new Map();

users.set('Agnaldo','Admin');
users.set('Joana','Admin');
users.set('Talia','User');
users.set('Fábio','Admin');
users.set('Casemiro','User');

console.log(getAdmin(users));