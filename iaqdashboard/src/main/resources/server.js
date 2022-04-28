const application = require('express')();
const server = require('http').createServer(application)
const io = require('socket.io')(server);
const PORT = process.env.PORT || 3000
 
application.get('/', (req, res) => {
   res.sendFile(__dirname + '/index.html');
});
 
server.listen(PORT, () => {
   console.log('Server is running on port: ' + PORT);
});
 
io.on('connection', (socket) => {
 
   socket.on('disconnect', () => {
       console.log('User disconnected - Username: ' + socket.username);
   });
 
   socket.on('new message', (msg) => {
       io.emit('send message', {message: msg, user: socket.username});
	   var data = {
		   portal: "TutorialsPoint",
		   tagLine: "SIMPLY LEARNING",
		   location: "Hyderabad"
		}
	   io.emit('message', data);      
   });
 
   socket.on('new user', (usr) => {
       socket.username = usr;
       console.log('User connected - Username: ' + socket.username);
   });
});  