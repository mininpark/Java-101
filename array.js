'use strict';

//Array 

// 1. Declaration
const arr1 = new Array();
const arr2 = [1, 2];

// 2. Index position
const fruits = ['🍎','🍌'];
console.log(fruits);
console.log(fruits.length);
console.log(fruits[1]);
console.log(fruits[2]); //undefined
console.log(fruits[fruits.length-1]); //undefined

// 3. Looping over an array
// print all fruits

// a. for
for (let i = 0; i < fruits.length; i++) {
    console.log(fruits[i]);
}

// b. for of
for (let fruit of fruits) {
    console.log(fruit);
}

// c. forEach
fruits.forEach((fruit) => console.log(fruit)); // callback 함수를 받아옴

// 4. Addition, deletion, copy
// push: add an Item to the end
fruits.push('🥒', '🍒');
console.log(fruits);
// pop: remove an item from the end
fruits.pop();
console.log();
console.log(fruits);

// unshift: add an item to the beginning
fruits.unshift ('🍍');
console.log(fruits);
// shift: 당겨오다 delete an item to the beginning
fruits.shift ();
fruits.shift ();
console.log(fruits);

// note!! shift, unshift are slower than pop, push!! 
// why? 인덱스 이동이 이루어져야 함

// splice: remove or replace an item by index postion
fruits.push ('🥝', '🍇', '🍋');
console.log(fruits);
fruits.splice(1, 1); // (index position, the number of items for deleting; without number it's going to be deleted every items from index position)
console.log(fruits);
fruits.splice(1, 1, '🍇', '🍋'); // removes and replaces
console.log(fruits);

// combine two arrays
const fruits2 = ['🍍','🥝']; // new array
const newFruits = fruits.concat(fruits2); //concat API: combine arrays and return new array
console.log(newFruits);

// 5. Searching
// indexOf: find the index
console.clear();
console.log(fruits);
console.log(fruits.indexOf('🍋')); //2-index; the first one of same items

// lastIndexOf
console.log(fruits.lastIndexOf('🍋')); //4-index; the last one of same items

// includes: 
console.log(fruits.includes('🍋')) //true;
console.log(fruits.includes('🥝')) //false;


