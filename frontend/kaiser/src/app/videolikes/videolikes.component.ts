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
  newTotalCounter = 0;

  ngOnInit(): void {
    this.enableVideoInfo = true;

    this.videoLikesDto = [];
    this.getVideoLikesDto();
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

    countLikesInfo() {
      console.log('count likes button is working');
      this.newTotalCounter = 0;
      this.newTotalCounter+=this.totalCounter;
    }

  }
