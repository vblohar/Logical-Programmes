async function myFuction(){
    let promise = new Promise((resolve, reject) => 
        { setTimeout( ()=>{resolve("Me!")},3000);

        });

    console.log("After promise: ", promise);

    wait = await promise;

    console.log("After await: ", wait); 
}

myFuction();
