import { Component, OnInit } from '@angular/core';
import { VideoLikeService } from '../service/videoLikeService.service';
import { videoLikesDto } from '../model/VideoLikesModel';

@Component({
  selector: 'app-videolikes',
  templateUrl: './videolikes.component.html',
  styleUrls: ['./videolikes.component.css']
})
export class VideolikesComponent implements OnInit {

  constructor(private videoLikeService: VideoLikeService) { }
  videoName: string;
  videoLikeCounter: number;
  videoLikesDto: videoLikesDto[];
  enableVideoInfo: boolean;
  arraySize: number;
  likeCounter: number;
  mycheckbox: boolean;
  selectedValues: any[];
  totalCounter = 0;

  ngOnInit(): void {
    this.enableVideoInfo = true;

    this.videoLikesDto = [];
    this.getVideoLikesDto();
    // this.videoLikeService.getVideoList().subscribe((videoResult: any) =>{
    //   this.videoName=videoResult[this.videoLikeCounter].videoName;
    //   this.videoLikeCounter=videoResult[this.videoLikeCounter].videoLikeCounter;
    // })
  }

  getVideoLikesDto() {
    this.videoLikeService.getVideoList().subscribe((videoLikeServiceResult: any) => {
		let vid = videoLikeServiceResult;
    
    videoLikeServiceResult.forEach((element: { name: string; likes: number}) => {
      let videoLikesDtoObject = {
        name: element.name,
        likes: element.likes,
        selectedLikes: false 
      };
      this.videoLikesDto.push(videoLikesDtoObject);
    });
    
    });
  }

  switchVideoLikesInfo() {
    console.log('switch button is working')
    if(this.enableVideoInfo){
      this.enableVideoInfo = false;
    } else {
      this.enableVideoInfo = true;
    }
  }

  totalLikes(event:any, likesCounter:any){
    // console.log('total button is working')
    // console.log(this.videoLikesDto, 'testing videolikesDto array')
    // console.log(event.checked)

    // this.likeCounter = 0;
    // this.arraySize = this.videoLikesDto.length;
    // for (let i =0; i < this.arraySize; i++) {
      // if(event.checked){
        // this.selectedValues.push(likesCounter);  -This is broken
      // } else {
        // this.selectedValues = this.selectedValues.filter(c => c.id != likesCounter.id); -This is broken
      // }
      this.countVideoLikes();
    }

    countVideoLikes(){
      this.totalCounter = 0;
      this.videoLikesDto.forEach( videos => {
        if(videos.selectedLikes){
          this.totalCounter += videos.likes
        }
      });
    }
  }